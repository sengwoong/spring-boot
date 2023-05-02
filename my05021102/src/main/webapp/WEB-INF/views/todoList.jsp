<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ page
language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <script
      type="text/javascript"
      src="//cdnjs.cloudflare.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"
    ></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <link
      href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
      rel="stylesheet"
      id="bootstrap-css"
    />
    <link rel="stylesheet" href="css/todoList.css" />
    <title>Title</title>
  </head>
  <body>
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <div class="todolist not-done">
            <h1>TODO LIST</h1>
            <input
              id="content"
              type="text"
              class="form-control add-todo"
              placeholder="할일을 입력하고 엔터를 치세요"
              autofocus
            />
            <hr />
            <ul id="sortable" class="list-unstyled"></ul>
            <div class="todo-footer">
              <strong>
                <span class="todo-count-todos">1</span>
              </strong>
              항목 남았음
            </div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="todolist">
            <h1>Already DONE</h1>
            <ul id="done-items" class="list-unstyled">
              <li></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </body>
  <script>
    console.log("스타일 참고", "https://bootsnipp.com/snippets/QbN51");

    // 할일을 입력하고 엔터하면 추가돼게 하기 (id는 content)
    const InputContent = $("#content");
    const React = () => {
      $.ajax({
        url: "api/v2/todo",
        type: "GET",
        contentType: "application/json;charset=utf-8",
        success: function (data) {
          console.log(data.data.todoList);
          $("#sortable").empty();
          $("#done-items").empty();
          DataSelecterTodoList(data.data.todoList, "N", "#sortable");

          DataSelecterTodoList(data.data.todoList, "Y", "#done-items");
        },
        error: function (e) {
          console.log(e);
        },
      });
    };

    //     // Axios 라이브러리 가져오기
    // const axios = require('axios');

    // // GET 요청 보내기
    // axios.get('https://jsonplaceholder.typicode.com/posts')
    //   .then(response => {
    //     // 요청 성공 시, 데이터 출력하기
    //     console.log(response.data);
    //   })
    //   .catch(error => {
    //     // 요청 실패 시, 에러 출력하기
    //     console.error(error);
    //   });

    const DataSelecterTodoList = (data, done, ContentClassName) => {
      const filteredData = data.filter((x) => {
        return x.doneYn === done;
      });

      $(".todo-count-todos").text(filteredData.length);
      filteredData.forEach((todo) => {
        if (done === "N") {
          $(ContentClassName).append(
            `
        <li class="ui-state-default">
          <div class="checkbox">
            <label>
              <input onchange="setDone(` +
              todo.idx +
              `)" type="checkbox" value="" />
              <span>
                ` +
              todo.content +
              `
              </span>


        `
          );
        } else {
          $(ContentClassName).append(
            `
        <li class="ui-state-default">
          <div class="checkbox">
            <label>
              <input onchange="setDone(
                ` +
              todo.idx +
              `
                )" type="checkbox" value="" />
              <span>
                ` +
              todo.content +
              `
              </span>
              <button
                        onclick="setDelete(
                          ` +
              todo.idx +
              ` )"


                class="remove-item p-30 btn btn-primary btn-sm float-end"/>



              `
          );
        }
      });
    };

    const setDone = (idx) => {
      $.ajax({
        url: "/api/v2/todo/" + idx,
        type: "PUT",
        contentType: "application/json;charset=utf-8",
      })
        .done((data) => {
          alert(data.message);
          console.log(data);
          React();
        })
        .fail((xhr, status, err) => {
          console.error(xhr);
          console.error(status);
          console.error(err);
        });
      React();
    };

    const setDelete = (idx) => {
      $.ajax({
        url: "/api/v2/todo/" + idx,
        type: "DELETE",
        contentType: "application/json;charset=utf-8",
        dataType: "json",
        success: function (data) {
          alert(data.message);
          console.log(data);
          React();
        },
        error: function (e) {
          console.log(e);
        },
      });
    };

    InputContent.on("keyup", function (event) {
      if (event.keyCode === 13) {
        if (InputContent.val() === "") {
          InputContent.focus();
          return;
        }

        const data = {
          content: InputContent.val(),
        };

        $.ajax({
          url: "api/v2/todo",
          type: "POST",
          data: JSON.stringify(data),
          contentType: "application/json;charset=utf-8",
          success: function (data) {
            console.log(data);
            React();
          },
          error: function (e) {
            console.log(e);
          },
        });
        location.reload();
        // 리스트에 새로운 요소 추가
      }
    });

    React();
  </script>
</html>

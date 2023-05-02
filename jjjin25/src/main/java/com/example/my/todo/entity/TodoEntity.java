package com.example.my.todo.entity;

import java.security.GeneralSecurityException;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoEntity {
    private Integer idx;
    private String content;
    private Character doneYn;
    private Character deleteYn;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private LocalDateTime deleteDate;

    @Override
    public String toString() {
        return "TodoEntity [idx=" + idx + ", content=" + content + ", doneYn=" + doneYn + ", deleteYn=" + deleteYn
                + ", createDate=" + createDate + ", updateDate=" + updateDate + ", deleteDate=" + deleteDate + "]";
    }

}

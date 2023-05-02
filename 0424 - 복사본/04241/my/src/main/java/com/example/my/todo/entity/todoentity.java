package com.example.my.todo.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class todoentity {
    private Integer idx;
    private String content;
    private Character doneYn;
    private Character deleteYn;
    private LocalDateTime createData;
    private LocalDateTime updateData;
    private LocalDateTime delectData;
    @Override
    public String toString() {
        return "todoentity [idx=" + idx + ", content=" + content + ", doneYn=" + doneYn + ", deleteYn=" + deleteYn
                + ", createData=" + createData + ", updateData=" + updateData + ", delectData=" + delectData + "]";
    }

    
}

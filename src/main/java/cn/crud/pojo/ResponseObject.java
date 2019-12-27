package cn.crud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObject {
    private String msg;
    private String code;
    private Object object;

    public ResponseObject(String msg, String code, Object object) {
        this.msg=msg;
        this.code=code;
        this.object=object;
    }
}

package szu.yui.mall.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MinioUploadDto {
    private String url;
    private String name;
}

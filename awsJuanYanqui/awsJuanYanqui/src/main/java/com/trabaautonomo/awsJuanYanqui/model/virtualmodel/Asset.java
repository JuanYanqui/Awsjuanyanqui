package com.trabaautonomo.awsJuanYanqui.model.virtualmodel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Asset {

    private byte[] content;
    private String contentType;
}

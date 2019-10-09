package com.tradeo.exp.bo;

public class YltBusDeclareResponseWithBLOBs extends YltBusDeclareResponse {
    /**
     * Column name: Rmk
     * Comment: 
     */
    private String rmk;

    /**
     * Column name: response_content
     * Comment: 
     */
    private String responseContent;

    /**
     * @return Rmk Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    public String getRmk() {
        return rmk;
    }

    /**
     * @param String rmk
     *  Column name: Rmk
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    public void setRmk(String rmk) {
        this.rmk = rmk;
    }

    /**
     * @return response_content Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    public String getResponseContent() {
        return responseContent;
    }

    /**
     * @param String responseContent
     *  Column name: response_content
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }
}
package com.webserver.model.mo;


public class TbQuestion {
    private Long id;
    private Long userId;
    private String question1;
    private String answer1;
    private String salt1;
    private String question2;
    private String answer2;
    private String salt2;
    private String question3;
    private String answer3;
    private String salt3;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getSalt1() {
        return salt1;
    }

    public void setSalt1(String salt1) {
        this.salt1 = salt1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getSalt2() {
        return salt2;
    }

    public void setSalt2(String salt2) {
        this.salt2 = salt2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getSalt3() {
        return salt3;
    }

    public void setSalt3(String salt3) {
        this.salt3 = salt3;
    }


    @Override
    public String toString() {
        return "TbQuestion{" +
                "id=" + id +
                ", userId=" + userId +
                ", question1='" + question1 + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", salt1='" + salt1 + '\'' +
                ", question2='" + question2 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", salt2='" + salt2 + '\'' +
                ", question3='" + question3 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", salt3='" + salt3 + '\'' +
                '}';
    }
}

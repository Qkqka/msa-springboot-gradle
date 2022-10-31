package com.msa.domain;

import lombok.Data;

@Data
public class GithubUserResponseDomain {

    private String login;
    private Long id;
    private String node_id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String repos_url;
    private String events_url;
    private String location;
    private String email;
    private String created_at;
    private String updated_at;
}

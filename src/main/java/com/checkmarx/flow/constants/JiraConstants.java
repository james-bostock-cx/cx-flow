package com.checkmarx.flow.constants;

public class JiraConstants {
    private JiraConstants(){}

    public static final String NEW_TICKET = "new";
    public static final String UPDATED_TICKET = "updated";
    public static final String CLOSED_TICKET = "closed";
    public static final int JIRA_MAX_DESCRIPTION = 32760;

    public static final int MAX_RESULTS_ALLOWED = 1000000;
    public static final String JIRA_ISSUE_TITLE_KEY_WITH_BRANCH = "%s%s in %s with severity %s @ %s [%s]%s";
    public static final String JIRA_ISSUE_TITLE_KEY = "%s%s in %s with severity %s @ %s%s";
    public static final String JIRA_ISSUE_BODY_WITH_BRANCH = "*%s* issue exists @ *%s* in branch *%s*";
    public static final String JIRA_ISSUE_BODY = "*%s* issue exists @ *%s*";
}

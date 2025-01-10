package com.myspring.test.team;

public class TeamDTO {
	private int teamId;
	private String teamName;
	private String teamProject;
	private String teamLeader;
	private String description;
	private String status;
	
	public int getTeamId() {
        return teamId;
    }
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamProject() {
		return teamProject;
	}
	public void setTeamProject(String teamProject) {
		this.teamProject = teamProject;
	}
	public String getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

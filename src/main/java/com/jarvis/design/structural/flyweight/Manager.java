package com.jarvis.design.structural.flyweight;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/12 11:27
 */
public class Manager implements Employee {
    private String title = "部门经理";
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public void report() {
        System.out.println(reportContent);
    }
}

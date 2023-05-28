package ru.netology.statistic;

import java.util.Arrays;

public class Epic extends Task {
    protected String[] subtasks = new String[0];

    public Epic(int id, String[] subtsks) {
        super(id);
        this.subtasks = new String[]{Arrays.toString(subtsks)};
    }

    public String[] getSubtasks() {
        return subtasks;
    }
    @Override
    public boolean matches(String query) {
        if (Arrays.asList(subtasks).contains(query)) {
            return true;
        }
    return false;
    }

}

package com.wulin.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wulin.domain.Role;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 用来处理本地json测试数据的工具类
 */
public class JsonUtil {

    private static Gson gson = new Gson();

    private static final String JSON_FILE_NAME = "src/test/jsons/Role.json";

    public static void addToJsonFile(Role role) {
        try {
            List<Role> roleList = getJson();
            if (roleList == null) {
                roleList = new ArrayList<>();
            }
            roleList.add(role);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(JSON_FILE_NAME), "UTF-8"));
            String json = gson.toJson(roleList);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Role> getJson() {
        List<Role> roleList = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(JSON_FILE_NAME)));
            roleList = gson.fromJson(reader, new TypeToken<List<Role>>() {
            }.getType());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roleList;
    }
}

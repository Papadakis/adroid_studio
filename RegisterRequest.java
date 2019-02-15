package com.example.papadakis.demo_thesis;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "https://clasping-pack.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String lastname, String username, String password, int age, String problem, String contact, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("lastname", lastname);
        params.put("username", username);
        params.put("password", password);
        params.put("age", age + "");
        params.put("problem", problem);
        params.put("contact", contact);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}


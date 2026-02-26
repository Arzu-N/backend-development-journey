package org.example.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Model.User;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
private final String FILE_PATH="users.json";
private final ObjectMapper mapper=new ObjectMapper();
private List<User> readUsersFromFile(){
    try{
    File file = new File(FILE_PATH);
    if(!file.exists())return new ArrayList<>();
    return mapper.readValue(file, new TypeReference<List<User>>() {
        });
    }
    catch(Exception e ){
        e.printStackTrace();
        return new ArrayList<>();
    }}

    private void writeUsersToFile(List<User>users){
    try{
        mapper.writer().withDefaultPrettyPrinter().writeValue(new File(FILE_PATH),users);
    }
    catch(Exception e){e.printStackTrace();}}

    public List<User>getAllUsers(){
    return readUsersFromFile();
    }
    public User getUserById(int id){
        List<User> users = readUsersFromFile();
       return  users.stream().filter(u->u.getId()==id).findFirst().orElse(null);
    }
    public void addUser(User user){
        List<User> users = readUsersFromFile();
        user.setId(generateNewId());
        users.add(user);
        writeUsersToFile(users);
    }
    public void updateUser(int id,User user){
        List<User> users = readUsersFromFile();
        for(User u:users){
            if(u.getId()==id){
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                break;
            }
        }
        writeUsersToFile(users);
    }

    public void deleteUser(int id){
        List<User> users = readUsersFromFile();
        users.removeIf(u->u.getId()==id);
        writeUsersToFile(users);
    }
    public int generateNewId(){
        List<User> users = readUsersFromFile();
        return users.stream().mapToInt(User::getId).max().orElse(0)+1;
    }
}



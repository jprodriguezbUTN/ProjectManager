/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystCeder el control


Compartir sonido


Optimizar


Diseño


Anotar


3
Gente

Dejar de compartir

emFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

/**
 *
 * @author jprod
 */
public class User {
    private String id;
    private String name;
    private String email;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User() {
        this("","","");
    }
    
}

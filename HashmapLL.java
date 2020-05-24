package lec27;

import java.util.LinkedList;

// using linked list
public class HashmapLL {

    LinkedList<Entity> entities = new LinkedList<>();

    public void put(String key, String value){
        for (Entity entity: entities){
            if(entity.key.equals(key)){
                entity.value=value;
                return;
            }
        }
        entities.add(new Entity(key, value));
    }
    //****************************

    public String get(String key){
        for (Entity entity: entities){
            if(entity.key.equals(key)){
                return  entity.value;
            }
        }
        return null;
    }

    public String remove(String key){
        Entity target = null;
        for(Entity entity:entities){
            if(entity.key.equals(key)){
                target = entity;
                break;
            }
        }
        String temp = target.value;
        entities.remove(target);
        return temp;
    }

    @Override
    public String toString(){
        String s = "";
        s+= "{";
        for(Entity entity:entities){
            s += (entity.key+" = "+ entity.value +" , ");
        }
        s +="}";
        return s;
    }
//**********************************
    class Entity{
        String key;
        String value;

        public Entity(String key, String value){
            this.key=key;
            this.value=value;
        }
    }
}

package lang.object.equals;

import java.util.Objects;

public class UserV1 {

    private String id;

    public UserV1(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV1 user = (UserV1) obj;
//        return id.equals(user.id);
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV1 userV1 = (UserV1) o;
        return Objects.equals(id, userV1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

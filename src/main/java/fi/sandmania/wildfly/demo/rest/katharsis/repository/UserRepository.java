package fi.sandmania.wildfly.demo.rest.katharsis.repository;

import fi.sandmania.wildfly.demo.rest.katharsis.model.User;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryV2;
import io.katharsis.resource.list.ResourceList;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by jounilatvatalo on 09/01/2017.
 */
@ApplicationScoped
public class UserRepository implements ResourceRepositoryV2<User, String> {

    @Override
    public Class<User> getResourceClass() {
        return User.class;
    }

    @Override
    public User findOne(String id, QuerySpec querySpec) {
        return new User();
    }

    @Override
    public ResourceList<User> findAll(QuerySpec querySpec) {
        return null;
    }

    @Override
    public ResourceList<User> findAll(Iterable<String> ids, QuerySpec querySpec) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public User save(User entity) {
        return null;
    }
}

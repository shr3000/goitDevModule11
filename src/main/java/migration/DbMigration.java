package migration;

import org.flywaydb.core.Flyway;

public class DbMigration {
    public void initDB(){
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:D:/GOITDev/goitDevModule11/db/interstellar", null, null)
                .load();
        flyway.migrate();
    }
}

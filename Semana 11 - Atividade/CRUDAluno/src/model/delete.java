package model;

    //DELETE
    public void DELETE()
    {
        String sql = "DELETE FROM Users WHERE username=?";
 
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "bill");
         
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("A user was deleted successfully!");
        }
    }

    

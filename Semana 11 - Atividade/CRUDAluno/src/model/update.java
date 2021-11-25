package model;

    //UPDATE
    public void UPDATE()
    {
        String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
    
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "123456789");
        statement.setString(2, "William Henry Bill Gates");
        statement.setString(3, "bill.gates@microsoft.com");
        statement.setString(4, "bill");
            
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) 
        {
            System.out.println("An existing user was updated successfully!");
        }
    }

    

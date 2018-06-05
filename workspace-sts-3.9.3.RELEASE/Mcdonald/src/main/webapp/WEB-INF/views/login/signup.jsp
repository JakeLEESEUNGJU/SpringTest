<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>signup</title>
</head>
<body>
<!-- 8. address
      10 : 경기도
      20 : 전라도
      30 : 경상도
       -->
    
      <div class="form-group">
        <label for="inputAddr" class="col-sm-2 control-label">Address</label>
        <div class="col-sm-9">
            <div class="btn-group btn-group-toggle" data-toggle="buttons" id="inputAddr">
            <label class="btn btn-secondary active">
                <input type="radio" name="addr" value="10" autocomplete="off" checked> 경기도
             </label>
            <label class="btn btn-secondary">
                <input type="radio" name="addr" value="20" autocomplete="off"> 전라도
              </label>
              <label class="btn btn-secondary">
                <input type="radio" name="addr" value="30" autocomplete="off"> 경상도
              </label>
        </div>
          <p class="col-sm-1"></p>
        </div>
      </div>
      
       <!-- 9. hobby
      10 : 수영
      20 : 음악감상
      30 : 공부
       -->
    
      <div class="form-group">
        <label for="inputHobbies" class="col-sm-2 control-label">Hobby</label>
        <div class="col-sm-9">
            <div class="btn-group btn-group-toggle" data-toggle="buttons" id="inputHobbies">
            <label class="btn btn-secondary active">
                <input type="checkbox" name="hobbies" value="10" > 수영
             </label>
            <label class="btn btn-secondary">
                <input type="checkBox" name="hobbies" value="20" > 음악감상
              </label>
              <label class="btn btn-secondary">
                <input type="checkBox" name="hobbies" value="30" > 공부
              </label>
        </div>
          <p class="col-sm-1"></p>
        </div>
      </div>
</body>
</html>
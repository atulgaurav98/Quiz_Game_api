const easyArr = [];
const medArr = [];
const hardArr = [];

axios
  .get(
    "https://i1ralxrhw7.execute-api.ap-south-1.amazonaws.com/test/getquestions"
  )
  .then(function (response) {
    // handle success

    var globalArr = response.data.body;
    //console.table(globalArr);
    globalArr.forEach((element) => {
      //console.log(element.status);
      if (element.question_type == "e") {
        //console.log(element);
        easyArr.push(element);
      }
      if (element.question_type == "m") {
        medArr.push(element);
      }
      if (element.question_type == "h") {
        hardArr.push(element);
      }
    });
    //console.log(easyArr, medArr, hardArr);
  })
  .catch(function (error) {
    // handle error
    console.log(error);
  });

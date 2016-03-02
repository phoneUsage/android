
// Use Parse.Cloud.define to define as many cloud functions as you want.
Parse.Cloud.define("getStatistics", function(request, response) {
  var query = new Parse.Query("PFDailyUsageEntry");
  var today = new Date()
  //same day last week
  var start = new Date()
  start.setDate(today.getDate()-7);
  var end = new Date()
  end.setDate(today.getDate()-6);
  console.log(start);
  console.log(end);
  query.greaterThan("date",start);
  query.lessThan("date", end);
  query.find({
    success: function(results) {
      var sum = 0.0, mean = 0.0, stdDev = 0.0, diffSqredArr = [];
      for (var i = 0; i < results.length; i++) {
        sum += results[i].get("totalUsage");
      }
      mean = sum / results.length;
      for(var j=0; j<results.length; j++){
       diffSqredArr.push(Math.pow((results[j].get("totalUsage")-mean),2));
      }
      if(diffSqredArr.length!=0){
        stdDev = (Math.sqrt(diffSqredArr.reduce(function(firstEl, nextEl){
              return firstEl + nextEl;
            })/diffSqredArr.length));
      }
      response.success([mean,stdDev]);
    },
    error: function() {
      response.error("statistics lookup failed");
    }
  });
});

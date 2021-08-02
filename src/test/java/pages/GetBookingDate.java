package pages;

public class GetBookingDate {
    //        DateTime fourthDayOfMonth = (new DateTime(today.Year, today.Month, 1) + AddMonths(1).AddDays(-4));
//        int fourthDayOfMonthInt = ((int)(fourthDayOfMonth.DayOfWeek));
//        DateTime thirdDayOfMonth = (new DateTime(today.Year, today.Month, 1) + AddMonths(1).AddDays(-3));
//        int thirdDayOfMonthInt = ((int)(thirdDayOfMonth.DayOfWeek));
//        DateTime secondDayOfMonth = (new DateTime(today.Year, today.Month, 1) + AddMonths(1).AddDays(-2));
//        int secondDayOfMonthInt = ((int)(secondDayOfMonth.DayOfWeek));
//        DateTime lastDayOfMonth = (new DateTime(today.Year, today.Month, 1) + AddMonths(1).AddDays(-1));
//        int lastDayOfMonthInt = ((int)(lastDayOfMonth.DayOfWeek));
//        int todaysDayInt = ((int)(today.DayOfWeek));
//        DateTime todayPlusTwo = today.AddDays(2);
//        DateTime todayPlusFour = today.AddDays(4);
////  Add 4 to Thur Fri
//        if (((today == fourthDayOfMonth)
//                && ((fourthDayOfMonthInt == 4)
//                || (fourthDayOfMonthInt == 5)))) {
//            driver.FindElement(By.ClassName("datepicker-inline")).Click();
//            //  Click the the next month of the Calendar
//            DateTime fourthDayOfMonthPlusFive = fourthDayOfMonth.AddDays(5);
//            //  Add 5 to fourthDayOfMonth
//            string fourthDayOfMonthPlusFiveDay = fourthDayOfMonthPlusFive.ToString("%d");
//            //  Get the day of fourthDayOfMonthPlusFive
//            driver.FindElement(By.XPath("//div[@data-date=\'{fourthDayOfMonthPlusFiveDay}\']")).Click();
//            //  Click the fourthDayOfMonthPlusFive in Calendar
//        }
//
//        if (((today == thirdDayOfMonth)
//                && ((thirdDayOfMonthInt == 4)
//                || (thirdDayOfMonthInt == 5)))) {
//            driver.FindElement(By.ClassName("datepicker-inline")).Click();
//            //  Click the the next month of the Calendar
//            DateTime thirdDayOfMonthPlusFive = thirdDayOfMonth.AddDays(5);
//            //  Add 5 to thirdDayOfMonth
//            string thirdDayOfMonthPlusFiveDay = thirdDayOfMonthPlusFive.ToString("%d");
//            //  Get the day of thirdDayOfMonthPlusFive
//            driver.FindElement(By.XPath("//div[@data-date=\'{thirdDayOfMonthPlusFiveDay}\']")).Click();
//            //  Click the thirdDayOfMonthPlusFiveDay in Calendar
//        }
//
//        if (((today == secondDayOfMonth)
//                && ((secondDayOfMonthInt == 4)
//                || (secondDayOfMonthInt == 5)))) {
//            driver.FindElement(By.ClassName("datepicker-inline")).Click();
//            //  Click the the next month of the Calendar
//            DateTime secondDayOfMonthPlusFive = secondDayOfMonth.AddDays(5);
//            //  Add 5 to secondDayOfMonth
//            string secondDayOfMonthPlusFiveDay = secondDayOfMonthPlusFive.ToString("%d");
//            //  Get the day of secondDayOfMonthPlusFive
//            driver.FindElement(By.XPath("//div[@data-date=\'{secondDayOfMonthPlusFiveDay}\']")).Click();
//            //  Click the secondDayOfMonthPlusFiveDay in Calendar
//        }
//
//        if (((today == lastDayOfMonth)
//                && ((lastDayOfMonthInt == 4)
//                || (lastDayOfMonthInt == 5)))) {
//            driver.FindElement(By.ClassName("datepicker-inline")).Click();
//            //  Click the the next month of the Calendar
//            DateTime lastDayOfMonthPlusFive = lastDayOfMonth.AddDays(5);
//            //  Add 5 to lastDayOfMonth
//            string lastDayOfMonthPlusFiveDay = lastDayOfMonthPlusFive.ToString("%d");
//            //  Get the day of lastDayOfMonthPlusFive
//            driver.FindElement(By.XPath("//div[@data-date=\'{secondDayOfMonthPlusFiveDay}\']")).Click();
//            //  Click the secondDayOfMonthPlusFiveDay in Calendar
//        }
//
//        if (((today == lastDayOfMonth)
//                && ((lastDayOfMonthInt == 1)
//                || ((lastDayOfMonthInt == 2)
//                || (lastDayOfMonthInt == 3))))) {
//            driver.FindElement(By.ClassName("datepicker-inline")).Click();
//            //  Click the the next month of the Calendar
//            DateTime lastDayOfMonthPlusTwo = lastDayOfMonth.AddDays(2);
//            //  Add 2 to lastDayOfMonth
//            string lastDayOfMonthPlusTwoDay = lastDayOfMonthPlusTwo.ToString("%d");
//            //  Get the day of lastDayOfMonthPlusTwo
//            driver.FindElement(By.XPath("//div[@data-date=\'{lastDayOfMonthPlusTwoDay}\']")).Click();
//            //  Click the secondDayOfMonthPlusFiveDay in Calendar
//        }
//
//        if (((todaysDayInt == 1)
//                || ((todaysDayInt == 2)
//                || (todaysDayInt == 3)))) {
//            string todaysDayPlusTwoDay = todayPlusTwo.ToString("%d");
//            //  Get the day of lastDayOfMonthPlusTwo
//            driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(15);
//            boolean staleElement = true;
//            while (staleElement) {
//                try {
//                    driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(15);
//                    driver.FindElement(By.XPath(("//div[@data-date=\'"
//                            + (todaysDayPlusTwoDay + "\']")))).Click();
//                    //  Click the Calendar
//                    // string cssColor = driver.FindElement(By.XPath("//div[@data-date='" + todaysDayPlusTwoDay + "']//span[1]")).GetCssValue("background-color");
//                    // cssColor = cssColor.Trim(); // Brake apart css color should be mainly GREEN color = rgba(49, 202, 200, 1)
//                    // int left = cssColor.IndexOf('(');
//                    // int right = cssColor.IndexOf(')');
//                    // string noBrackets = cssColor.Substring(left + 1, right - left - 1);
//                    // string[] parts = noBrackets.Split(',');
//                    // int r = int.Parse(parts[0], CultureInfo.InvariantCulture);
//                    // int g = int.Parse(parts[1], CultureInfo.InvariantCulture);
//                    // int b = int.Parse(parts[2], CultureInfo.InvariantCulture);
//                    // int a = int.Parse(parts[3], CultureInfo.InvariantCulture);
//                    // Assert.AreEqual(49, r);
//                    // Assert.AreEqual(202, g);
//                    // Assert.AreEqual(200, b);
//                    // Assert.AreEqual(1, a);
//                    staleElement = false;
//                }
//                catch (StaleElementReferenceException e) {
//                    staleElement = true;
//                }
//
//            }
//
//        }
//        else {
//            string todaysDayPlusFourDay = todayPlusFour.ToString("%d");
//            //  Get the day of the booking
//            driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(15);
//            boolean staleElement2 = true;
//            while (staleElement2) {
//                try {
//                    driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(15);
//                    driver.FindElement(By.XPath(("//div[@data-date=\'"
//                            + (todaysDayPlusFourDay + "\']")))).Click();
//                    //  Click the Calendar
//                    staleElement2 = false;
//                }
//                catch (StaleElementReferenceException e) {
//                    staleElement2 = true;
//                }
//
//            }
//
//        }
//    }
}

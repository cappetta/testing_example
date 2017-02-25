# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class TestSearchFilter(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "http://caffeinestate.com/qa/client/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_search_filter(self):
        driver = self.driver
        driver.get(self.base_url + "/qa/client/")
        driver.find_element_by_id("input_0").clear()
        driver.find_element_by_id("input_0").send_keys("delivered")

driver.find_element_by_xpath("(//img[@id='editIcon'])[2]").click()
driver.find_element_by_xpath("(//img[@id='editIcon'])[5]").click()
driver.find_element_by_xpath("(//img[@id='editIcon'])[5]").click()
driver.find_element_by_id("input_38").clear()
driver.find_element_by_id("input_38").send_keys("1200.00")
driver.find_element_by_xpath("(//img[@id='editIcon'])[6]").click()
driver.find_element_by_id("input_39").clear()
driver.find_element_by_id("input_39").send_keys("delivered - status")
driver.find_element_by_xpath("(//img[@id='editIcon'])[3]").click()
driver.find_element_by_xpath("(//button[@id='moreInfoButton'])[3]").click()
driver.find_element_by_id("input_0").clear()
driver.find_element_by_id("input_0").send_keys("")
    
    def is_element_present(self, how, what):
        try: self.driver.find_element(by=how, value=what)
        except NoSuchElementException as e: return False
        return True
    
    def is_alert_present(self):
        try: self.driver.switch_to_alert()
        except NoAlertPresentException as e: return False
        return True
    
    def close_alert_and_get_its_text(self):
        try:
            alert = self.driver.switch_to_alert()
            alert_text = alert.text
            if self.accept_next_alert:
                alert.accept()
            else:
                alert.dismiss()
            return alert_text
        finally: self.accept_next_alert = True
    
    def tearDown(self):
        self.driver.quit()
        self.assertEqual([], self.verificationErrors)

if __name__ == "__main__":
    unittest.main()

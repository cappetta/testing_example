from selenium import webdriver
import unittest
import sys

class ExampleTestCase(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Remote(desired_capabilities={
            "browserName": "firefox",
            "platform": "LINUX",
        })

    def test_example(self):
        self.driver.get("http://www.google.com")
        self.assertEqual(self.driver.title, "Google")

    def tearDown(self):
        self.driver.quit()

if __name__ == "__main__":
    unittest.main()



http://www.guru99.com/introduction-to-selenium-grid.html
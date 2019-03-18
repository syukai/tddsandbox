from TestResult import TestResult
import traceback
class TestCase:
    def __init__(self, name):
        self.name = name
        self.log = None
    def setUp(self):
        pass
    def tearDown(self):
        pass
    def run(self, result):
        result.testStarted()
        self.setUp()
        try:
            method = getattr(self, self.name)
            method()
        except Exception as e:
            # traceback.print_exc()
            result.testFailed()
        self.tearDown()

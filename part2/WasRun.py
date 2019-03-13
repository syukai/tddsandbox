from TestCase import TestCase
class WasRun(TestCase):
    def __init__(self, name):
        self.name = name
        super().__init__(name)
    def testMethod(self):
        self.wasRun = 1

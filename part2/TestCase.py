class TestCase:
    def __init__(self, name):
        self.name = name
        self.log = None
    def setUp(self):
        pass
    def tearDown(self):
        pass
    def run(self):
        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()
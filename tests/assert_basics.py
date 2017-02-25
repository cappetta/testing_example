import pytest

def f():
    raise SystemExit(1)
#
# def test_mytest():
#     with pytest.raises(SystemExit):
#         f()
#
# def test_mytest2():
#    f()
#    #pass


def test_winrm():
    x = 76
    if x < 75:
        fail ("more than 75 connections")



def test_asset_1():
    assert 1

def test_assert_true():
    return True

def test_asset_none():
    return None

def test_assert_garbage_no_quote():
    return 'asdfasdfasdfasdf'

# ---------------
def test_assert_false():
    return False

def test_asset_0():
    assert 0

def test_assert_garbage_no_quote():
    return asdfasdfasdfasdf

def test_assert_unknown(self, unknown=None):
    assert '' in unknown
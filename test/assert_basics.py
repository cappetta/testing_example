import pytest
import sys

def f():
    raise SystemExit(1)
#
def test_with_exception_caught():
    with pytest.raises(SystemExit):
      raise SystemExit(1)


def test_winrm(tries=76):
    assert tries < 75


def test_asset_1():
    assert 1

def test_assert_true():
    return True

def test_asset_none():
    return None

def test_assert_garbage_no_quote():
    return 'asdfasdfasdfasdf'

def test_asset_1():
    assert 1

# ---------------
def test_assert_false():
    return False

def test_asset_0():
    assert 0

def test_assert_garbage_no_quote():
    return asdfasdfasdfasdf

def test_assert_unknown(unknown=None):
    assert '' in unknown

@pytest.mark.skip(reason="skip example")
def test_skip():
    assert '1' in '1'

@pytest.mark.skipif(sys.version_info < (3,3),
                    reason="requires python 3.3")
def test_skipIf_missing_python33(self):
    assert '1' in '1'


@pytest.mark.skipif(sys.platform == 'win32',
                    reason="does not run on windows")
def test_skipIf_windows():
    assert 1

@pytest.mark.skipif(sys.platform == 'linux2',
                    reason="does not run on linux")
def test_skipIf_linux():
    assert 1

@pytest.mark.skipif(sys.platform == 'darwin',
                    reason="does not run on OSX")
def test_skipIf_OSX():
    assert 1

@pytest.mark.xfail
def test_fail_expected():
    assert 0


@pytest.mark.xfail
def test_fail_expected_strict(strict=True):
    assert 0

@pytest.mark.xfail
def test_fail_expected_but_passing():
    assert 1

@pytest.mark.xfail(run=False)
def test_run_false():
    assert 1





xfail = pytest.mark.xfail

@xfail
def test_hello():
    assert 0

@xfail(run=False)
def test_hello2():
    assert 0

@xfail("hasattr(os, 'sep')")
def test_hello3():
    assert 0

@xfail(reason="bug 110")
def test_hello4():
    assert 0

@xfail('pytest.__version__[0] != "17"')
def test_hello5():
    assert 0

def test_hello6():
    pytest.xfail("reason")

@xfail(raises=IndexError)
def test_hello7():
    x = []
    x[1] = 1
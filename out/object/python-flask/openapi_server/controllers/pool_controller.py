import connexion
import six

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.pool import Pool  # noqa: E501
from openapi_server.models.pool_collection import PoolCollection  # noqa: E501
from openapi_server import util


def create_pool(pool):  # noqa: E501
    """Create a pool

     # noqa: E501

    :param pool: 
    :type pool: dict | bytes

    :rtype: Pool
    """
    if connexion.request.is_json:
        pool = Pool.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_pool(pool_name):  # noqa: E501
    """Delete a pool

     # noqa: E501

    :param pool_name: The Pool name.
    :type pool_name: str

    :rtype: None
    """
    return 'do some magic!'


def get_pool(pool_name):  # noqa: E501
    """Get a pool

     # noqa: E501

    :param pool_name: The Pool name.
    :type pool_name: str

    :rtype: Pool
    """
    return 'do some magic!'


def get_pools(limit=None, offset=None):  # noqa: E501
    """Get all pools

     # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: PoolCollection
    """
    return 'do some magic!'


def update_pool(pool_name, pool, update_mask=None):  # noqa: E501
    """Update a pool

     # noqa: E501

    :param pool_name: The Pool name.
    :type pool_name: str
    :param pool: 
    :type pool: dict | bytes
    :param update_mask: The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: Pool
    """
    if connexion.request.is_json:
        pool = Pool.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

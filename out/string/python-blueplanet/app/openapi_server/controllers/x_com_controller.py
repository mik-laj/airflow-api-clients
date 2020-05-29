import connexion
import six

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.x_com import XCom  # noqa: E501
from app.openapi_server.models.x_com_collection import XComCollection  # noqa: E501
from openapi_server import util


def delete_x_com_value(dag_id, dag_run_id, task_id, key):  # noqa: E501
    """Delete an XCom entry

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param task_id: The Task ID.
    :type task_id: str
    :param key: The XCom Key.
    :type key: str

    :rtype: None
    """
    return 'do some magic!'


def get_x_com_entry(dag_id, dag_run_id, task_id, limit=None, offset=None):  # noqa: E501
    """Get all XCom entries

    This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances. # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param task_id: The Task ID.
    :type task_id: str
    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: XComCollection
    """
    return 'do some magic!'


def get_x_com_value(dag_id, dag_run_id, task_id, key):  # noqa: E501
    """Get an XCom entry

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param task_id: The Task ID.
    :type task_id: str
    :param key: The XCom Key.
    :type key: str

    :rtype: XCom
    """
    return 'do some magic!'


def update_x_com_entry(dag_id, dag_run_id, task_id, body):  # noqa: E501
    """Create an XCom entry

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param task_id: The Task ID.
    :type task_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: XCom
    """
    if connexion.request.is_json:
        body = XCom.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_x_com_value(dag_id, dag_run_id, task_id, key, body, update_mask=None):  # noqa: E501
    """Update an XCom entry

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param task_id: The Task ID.
    :type task_id: str
    :param key: The XCom Key.
    :type key: str
    :param body: 
    :type body: dict | bytes
    :param update_mask: The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: XCom
    """
    if connexion.request.is_json:
        body = XCom.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

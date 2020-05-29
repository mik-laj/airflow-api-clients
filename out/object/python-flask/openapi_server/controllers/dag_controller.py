import connexion
import six

from openapi_server.models.clear_task_instance import ClearTaskInstance  # noqa: E501
from openapi_server.models.dag import DAG  # noqa: E501
from openapi_server.models.dag_collection import DAGCollection  # noqa: E501
from openapi_server.models.dag_detail import DAGDetail  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from openapi_server.models.task import Task  # noqa: E501
from openapi_server.models.task_collection import TaskCollection  # noqa: E501
from openapi_server.models.task_instance_reference_collection import TaskInstanceReferenceCollection  # noqa: E501
from openapi_server import util


def clear_task_instance(dag_id, clear_task_instance):  # noqa: E501
    """Clears a set of task instances associated with the DAG for a specified date range.

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param clear_task_instance: Parameters of action
    :type clear_task_instance: dict | bytes

    :rtype: TaskInstanceReferenceCollection
    """
    if connexion.request.is_json:
        clear_task_instance = ClearTaskInstance.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_dag(dag_id):  # noqa: E501
    """Get basic information about a DAG

    Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str

    :rtype: DAG
    """
    return 'do some magic!'


def get_dag_detail(dag_id):  # noqa: E501
    """Get a simplified representation of DAG.

    The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str

    :rtype: DAGDetail
    """
    return 'do some magic!'


def get_dag_source(file_token):  # noqa: E501
    """Get source code using file token

     # noqa: E501

    :param file_token: The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
    :type file_token: str

    :rtype: InlineResponse2001
    """
    return 'do some magic!'


def get_dags(limit=None, offset=None):  # noqa: E501
    """Get all DAGs

     # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: DAGCollection
    """
    return 'do some magic!'


def get_task(dag_id, task_id):  # noqa: E501
    """Get simplified representation of a task.

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param task_id: The Task ID.
    :type task_id: str

    :rtype: Task
    """
    return 'do some magic!'


def get_tasks(dag_id):  # noqa: E501
    """Get tasks for DAG

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str

    :rtype: TaskCollection
    """
    return 'do some magic!'


def update_dag(dag_id, dag):  # noqa: E501
    """Update a DAG

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag: 
    :type dag: dict | bytes

    :rtype: DAG
    """
    if connexion.request.is_json:
        dag = DAG.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

package cronapi.watson.visual_recognition;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.*;
import cronapi.CronapiMetaData;

import java.util.Map;

@CronapiMetaData(categoryName = "Watson Natural Language Understanding",
    categoryTags = {"Watson", "Natural", "Language", "Understanding"})
public final class NaturalLanguageUnderstandingOperations {

  @CronapiMetaData(
      name = "{{analyzeName}}",
      description = "{{analyzeDescription}}"
  )
  public static AnalysisResults analyze(String versionDate, String username, String password, String endPoint,
                                        Map<String, String> headers, AnalyzeOptions options) {
    NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);
    return service.analyze(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteModelName}}",
      description = "{{deleteModelDescription}}"
  )
  public static void deleteModel(String versionDate, String username, String password, String endPoint,
                                 Map<String, String> headers, DeleteModelOptions options) {
    NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteModel(options).execute();
  }

  @CronapiMetaData(
      name = "{{listModelsModelName}}",
      description = "{{listModelsModelDescription}}"
  )
  public static ListModelsResults listModels(String versionDate, String username, String password, String endPoint,
                                             Map<String, String> headers, ListModelsOptions options) {
    NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listModels(options).execute();
  }
}

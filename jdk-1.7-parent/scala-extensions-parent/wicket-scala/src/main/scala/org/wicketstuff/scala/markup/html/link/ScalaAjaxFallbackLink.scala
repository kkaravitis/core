package org.wicketstuff.scala.markup.html.link

import org.apache.wicket.ajax.AjaxRequestTarget
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink
import org.apache.wicket.model.IModel
import org.wicketstuff.scala.traits.ScalaMarkupContainerT

class ScalaAjaxFallbackLink[T](id:String, f: (Option[AjaxRequestTarget]) ⇒ Unit, model: IModel[T] = null)
  extends AjaxFallbackLink[T](id, model)
  with ScalaMarkupContainerT {

  override val self: ScalaAjaxFallbackLink[T] = this

  override final def onClick(target: AjaxRequestTarget): Unit = f(Option(target))
}
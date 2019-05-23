/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.scoping2.scoping2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.scoping2.scoping2.Chapter;
import org.xtext.example.scoping2.scoping2.Paragraph;
import org.xtext.example.scoping2.scoping2.Reference;
import org.xtext.example.scoping2.scoping2.Scoping2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.scoping2.scoping2.impl.ChapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.scoping2.scoping2.impl.ChapterImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.xtext.example.scoping2.scoping2.impl.ChapterImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChapterImpl extends MinimalEObjectImpl.Container implements Chapter
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParagraphs()
   * @generated
   * @ordered
   */
  protected EList<Paragraph> paragraphs;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<Reference> references;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChapterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Scoping2Package.Literals.CHAPTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Scoping2Package.CHAPTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Paragraph> getParagraphs()
  {
    if (paragraphs == null)
    {
      paragraphs = new EObjectContainmentEList<Paragraph>(Paragraph.class, this, Scoping2Package.CHAPTER__PARAGRAPHS);
    }
    return paragraphs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Reference> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<Reference>(Reference.class, this, Scoping2Package.CHAPTER__REFERENCES);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Scoping2Package.CHAPTER__PARAGRAPHS:
        return ((InternalEList<?>)getParagraphs()).basicRemove(otherEnd, msgs);
      case Scoping2Package.CHAPTER__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Scoping2Package.CHAPTER__NAME:
        return getName();
      case Scoping2Package.CHAPTER__PARAGRAPHS:
        return getParagraphs();
      case Scoping2Package.CHAPTER__REFERENCES:
        return getReferences();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Scoping2Package.CHAPTER__NAME:
        setName((String)newValue);
        return;
      case Scoping2Package.CHAPTER__PARAGRAPHS:
        getParagraphs().clear();
        getParagraphs().addAll((Collection<? extends Paragraph>)newValue);
        return;
      case Scoping2Package.CHAPTER__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends Reference>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Scoping2Package.CHAPTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Scoping2Package.CHAPTER__PARAGRAPHS:
        getParagraphs().clear();
        return;
      case Scoping2Package.CHAPTER__REFERENCES:
        getReferences().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Scoping2Package.CHAPTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Scoping2Package.CHAPTER__PARAGRAPHS:
        return paragraphs != null && !paragraphs.isEmpty();
      case Scoping2Package.CHAPTER__REFERENCES:
        return references != null && !references.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ChapterImpl
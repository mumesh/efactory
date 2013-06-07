/*******************************************************************************
 * Copyright (c) 2009 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
/*
 * generated by Xtext
 */
package com.googlecode.efactory.ui.contentassist;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.googlecode.efactory.eFactory.Feature;
import com.googlecode.efactory.eFactory.NewObject;
import com.googlecode.efactory.util.EcoreUtil3;

/**
 * see http://wiki.eclipse.org/Xtext/Documentation#Content_Assist on how to
 * customize content assistant
 */
public class EFactoryProposalProvider extends AbstractEFactoryProposalProvider {

	private static final String L_BRACE = "{";

	private static final String SAMPLE_DATE = "12.31.2008";

	@Override
	public void completeKeyword(Keyword keyword,
			ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		EObject currentModel = contentAssistContext.getCurrentModel();
		if (currentModel == null || !(currentModel instanceof Feature)) {
			super.completeKeyword(keyword, contentAssistContext, acceptor);
		}
	}

	@Override
	public void complete_DATE(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof Feature) {
			Feature feature = (Feature) model;
			if (EcoreUtil3.isDateAttribute(feature.getEFeature())) {
				acceptor.accept(createCompletionProposal(model, SAMPLE_DATE,
						context));
			}
		}
	}

	public void completeNewObject_EClass(Feature model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (EcoreUtil3.isEContainment(model.getEFeature())) {
			super.completeNewObject_EClass(model, assignment, context, acceptor);
		}
	}

	@Override
	public void completeReference_Value(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof Feature) {
			Feature feature = (Feature) model;
			if (EcoreUtil3.isEReference(feature.getEFeature())) {
				super.completeReference_Value(model, assignment, context,
						acceptor);
			}
		}
	}

	@Override
	public void complete_STRING(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof Feature) {
			Feature feature = (Feature) model;
			if (EcoreUtil3.isStringAttribute(feature.getEFeature())) {
				super.complete_STRING(model, ruleCall, context, acceptor);
			}
		}

	}

	@Override
	public void complete_DOUBLE(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof Feature) {
			Feature feature = (Feature) model;
			if (EcoreUtil3.isDoubleAttribute(feature.getEFeature())) {
				createDoubleProposal(context, acceptor, ruleCall);
			}
		}
	}

	private void createDoubleProposal(ContentAssistContext context,
			ICompletionProposalAcceptor acceptor, RuleCall ruleCall) {
		String proposalText = "0.0";
		String displayText = proposalText + " - "
				+ ruleCall.getRule().getName();

		ICompletionProposal proposal = createCompletionProposal(proposalText,
				displayText, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			ConfigurableCompletionProposal configurable = (ConfigurableCompletionProposal) proposal;
			configurable.setSelectionStart(configurable.getReplacementOffset());
			configurable.setSelectionLength(proposalText.length());
			configurable.setAutoInsertable(false);
			configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
		}
		acceptor.accept(proposal);
	}

	@Override
	public void complete_LONG(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof Feature) {
			Feature feature = (Feature) model;
			if (EcoreUtil3.isIntegerAttribute(feature.getEFeature())) {
				createLongProposal(context, acceptor, ruleCall, ruleCall.getRule().getName(), 1L);
			}
		}
	}

	// copy/paste from TerminalsProposalProvider.createIntProposal()
	private void createLongProposal(ContentAssistContext context,
			ICompletionProposalAcceptor acceptor, RuleCall ruleCall, String feature, long i) {
		String proposalText = getValueConverter().toString(i, ruleCall.getRule().getName());
		String displayText = proposalText + " - " + ruleCall.getRule().getName();
		if (feature != null)
			displayText = proposalText + " - " + feature;
		ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			ConfigurableCompletionProposal configurable = (ConfigurableCompletionProposal) proposal;
			configurable.setSelectionStart(configurable.getReplacementOffset());
			configurable.setSelectionLength(proposalText.length());
			configurable.setAutoInsertable(false);
			configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
		}
		acceptor.accept(proposal);
	}

	@Override
	public void completeBooleanAttribute_Value(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof Feature) {
			Feature feature = (Feature) model;
			if (EcoreUtil3.isBooleanAttribute(feature.getEFeature())) {
				acceptor.accept(createCompletionProposal("true", context));
				acceptor.accept(createCompletionProposal("false", context));
			}
		}
	}

	@Override
	public void completeFeature_EFeature(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		NewObject newObject = null;
		if (model instanceof NewObject) {
			INode lastCompleteNode = context.getLastCompleteNode();
			if (lastCompleteNode instanceof LeafNode) {
				LeafNode lastNode = (LeafNode) lastCompleteNode;
				if (lastNode.getText().equals(L_BRACE)) {
					newObject = (NewObject) model;
				} else {
					newObject = (NewObject) model.eContainer().eContainer()
							.eContainer();
				}
			}
		}
		if (newObject == null) {
			newObject = EcoreUtil2.getContainerOfType(model, NewObject.class);
		}
		if (newObject == null) {
			return;
		}
		
		for (EStructuralFeature eFeature : newObject.getEClass()
				.getEAllStructuralFeatures()) {
			if (isValid(newObject, eFeature)) {
				acceptor.accept(createCompletionProposal(eFeature,
						eFeature.getName(), context));
			}
		}
	}

	@Override
	public void completeFeature_IsMany(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof Feature) {
			Feature feature = (Feature) model;
			if (feature.getEFeature().isMany()) {
				acceptor.accept(createCompletionProposal(model, "+=", context));
			} else {
				acceptor.accept(createCompletionProposal(model, "=", context));
			}
		}
	}

	private boolean isValid(final NewObject model, EStructuralFeature eFeature) {
		return isFeature(model, eFeature) && isNoDuplicate(model, eFeature)
				&& eFeature.isChangeable();
	}

	private boolean isNoDuplicate(NewObject model, EObject element) {
		return !EcoreUtil3.isDuplicate(model.getFeatures(),
				(EStructuralFeature) element);
	}

	private boolean isFeature(final NewObject model, EObject eObject) {
		return EcoreUtil3.hasFeature(model.getEClass(),
				(EStructuralFeature) eObject);
	}

	@Override
	public void complete_EnumAttribute(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		if (model instanceof Feature) {
			Feature feature = (Feature) model;
			EClassifier eType = feature.getEFeature().getEType();
			if (eType instanceof EEnum) {
				EEnum eEnum = (EEnum) eType;
				for (EEnumLiteral literal : eEnum.getELiterals()) {
					acceptor.accept(createCompletionProposal(model, ":"
							+ literal.getName(), context));
				}
			}
			super.complete_EnumAttribute(model, ruleCall, context, acceptor);
		}
	}

	private ICompletionProposal createCompletionProposal(EObject model,
			String string, ContentAssistContext context) {
		return super.createCompletionProposal(string, context);
	}

}

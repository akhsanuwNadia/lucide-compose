package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreditCardPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 11.354f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(4f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 17f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 14f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.CreditCardPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreditCardPlus: ImageVector
    @Composable get() = CreditCardPlusDefinition.asImageVector()

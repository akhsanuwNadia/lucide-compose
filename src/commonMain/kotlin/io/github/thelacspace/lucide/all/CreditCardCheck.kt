package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreditCardCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.5f, 19f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, Vf)
                arcToRelative(7f, af, 2f, false, false, 012f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 17f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.CreditCardCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreditCardCheck: ImageVector
    @Composable get() = CreditCardCheckDefinition.asImageVector()

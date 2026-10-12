package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WalletCards") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                horizontalLineToRelative(3.75f)
                arcToRelative(2f, 2f, 0f, false, true, 1.6f, .8f)
                lineToRelative(.45f, .6f)
                arcToRelative(4f, 4f, 0f, false, false, 6.4f, 0f)
                lineToRelative(.45f, -.6f)
                arcToRelative(2f, 2f, 0f, false, true, 1.6f, -.8f)
                horizontalLineTo(21f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.WalletCardsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WalletCards: ImageVector
    @Composable get() = WalletCardsDefinition.asImageVector()

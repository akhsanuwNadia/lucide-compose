package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Faucet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.083f, 5.428f)
                lineTo(5.57f, 4.083f)
                arcToRelative(2f, 2f, 0f, false, false, lf, 4.512f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.917f, 5.428f)
                lineToRelative(4.511f, -1.345f)
                arcToRelative(2f, 2f, 0f, false, false, lf, -4.51f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 17f)
                verticalLineToRelative(-4.006f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 11f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, .994f, hf)
                arcToRelative(-2.539f, af, 4f, false, false, 00f, -6.915f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.FaucetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Faucet: ImageVector
    @Composable get() = FaucetDefinition.asImageVector()

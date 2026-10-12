package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Screw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 9f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 13f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f, 10.5f)
                lineTo(5.706f, 21.294f)
                arcTo(2.4f, 2.4f, 0f, false, false, Hf, 2.5f)
                arcToRelative(.5f, .5f, 0f, true, false, -.5f, vf)
                arcToRelative(-1.502f, af, 2.4f, false, false, 01.706f, -1.704f)
                lineTo(13.5f, 7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.819f, 11.575f)
                arcToRelative(6f, 6f, 0f, false, false, .6f, .6f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 13f)
                verticalLineToRelative(8f)
            }
}

public val LucideIcons.All.ScrewDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Screw: ImageVector
    @Composable get() = ScrewDefinition.asImageVector()

package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BoneFracture") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 4.5f)
                arcToRelative(1f, 1f, 0f, false, true, 5f, 0f)
                arcToRelative(.5f, .5f, 0f, false, false, .5f, .5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 5f)
                curveToRelative(-.81f, 0f, -1.8f, -.7f, -2.5f, 0f)
                lineToRelative(-1.958f, 1.957f)
                arcToRelative(.15f, .15f, 0f, false, true, -.252f, -.072f)
                lineToRelative(-.493f, -2.07f)
                arcToRelative(.15f, .15f, 0f, false, false, -.111f, -.112f)
                lineToRelative(-2.072f, -.494f)
                arcToRelative(.15f, .15f, 0f, false, true, -.072f, -.252f)
                lineTo(14f, 7f)
                curveToRelative(.7f, -.7f, 0f, -1.69f, 0f, -2.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 20f)
                lineToRelative(-1f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 16f)
                lineToRelative(-2f, -1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4f, 8f)
                lineToRelative(2f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 4f)
                lineToRelative(1f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.698f, 14.19f)
                arcToRelative(.15f, .15f, 0f, false, false, .112f, .112f)
                lineToRelative(2.074f, .489f)
                arcToRelative(.15f, .15f, 0f, false, true, .072f, .252f)
                lineTo(10f, 17f)
                curveToRelative(-.7f, .7f, 0f, 1.69f, 0f, 2.5f)
                arcToRelative(1f, 1f, 0f, false, true, -5f, 0f)
                arcToRelative(.495f, .495f, 0f, false, false, -.5f, -.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                curveToRelative(.81f, 0f, 1.8f, .7f, 2.5f, 0f)
                lineToRelative(1.956f, -1.957f)
                arcToRelative(.15f, .15f, 0f, false, true, .252f, .072f)
                close()
            }
}

public val LucideIcons.All.BoneFractureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BoneFracture: ImageVector
    @Composable get() = BoneFractureDefinition.asImageVector()

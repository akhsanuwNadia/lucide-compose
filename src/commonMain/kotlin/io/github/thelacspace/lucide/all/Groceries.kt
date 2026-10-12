package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Groceries") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.424f, 11.095f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2f, 2f)
                arcToRelative(0f, 00.424f, -3.286f, false, false, 0f, 00f)
                arcToRelative(-2.143f, -3.322f, 2f, false, false, 00f, -.676f)
                arcToRelative(.502f, 2f, 2f, false, false, -3.287f, .424f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.06f, Af)
                arcToRelative(3f, 3f, 0f, false, false, lf, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12.006f)
                arcTo(1f, 1f, 0f, false, false, Hf, 19f)
                arcToRelative(1f, 1f, 0f, false, true, vf, 7f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, Hf)
                arcToRelative(6f, af, 2f, false, false, 01f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 11f)
                arcToRelative(4f, 4f, 0f, true, false, -4f, Vf)
                arcToRelative(5f, af, 1f, true, false, 011f, -1f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.GroceriesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Groceries: ImageVector
    @Composable get() = GroceriesDefinition.asImageVector()

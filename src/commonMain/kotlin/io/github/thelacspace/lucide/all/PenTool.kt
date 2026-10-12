package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PenTool") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(18f, 13f)
                lineToRelative(-.654f, -4.736f)
                arcToRelative(4f, 4f, 0f, false, false, -3.266f, lf)
                arcToRelative(-9.163f, -2.9f, af, false, false, 0f, 00f)
                arcToRelative(-2.017f, .493f, lf, false, false, af, 2f)
                arcToRelative(2f, 0f, 00f, false, false, lf, 2.9f)
                arcToRelative(9.163f, af, 4f, false, false, 003.266f, 2.756f)
                lineTo(13f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.648f, 12.352f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, lf, 1.296f)
                arcToRelative(1.296f, af, 1.205f, true, false, 010f, 1.704f)
                lineToRelative(-6.296f, 6.296f)
                arcToRelative(1.205f, 1.205f, 0f, true, false, 0f, lf)
                arcToRelative(-1.296f, -1.296f, af, true, true, 0f, 010f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 3f)
                lineToRelative(6.586f, 6.586f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.PenToolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PenTool: ImageVector
    @Composable get() = PenToolDefinition.asImageVector()

package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NepaliRupee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,16.173f)
                curveTo(19.776468f,14.726f,20.263618f,12.215461f,19.157253f,10.209069f)
                curveTo(18.05089f,8.202677f,15.667764f,7.274866f,13.496f,8.005f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(20.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,13.0f)
                lineTo(13.5f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,13.0f)
                lineTo(9.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,13.0f)
                curveTo(15.5f,13.0f,14.667f,3.0f,8.0f,3.0f)
            }
}

public val LucideIcons.All.NepaliRupeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NepaliRupee: ImageVector
    @Composable get() = NepaliRupeeDefinition.asImageVector()

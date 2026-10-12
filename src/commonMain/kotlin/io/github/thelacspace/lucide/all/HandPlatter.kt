package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandPlatter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.4f,17.4f)
                lineTo(18.6f,14.599999f)
                curveTo(19.117336f,14.096012f,19.864792f,13.907353f,20.55934f,14.105457f)
                curveTo(21.253885f,14.303562f,21.789345f,14.858147f,21.962965f,15.559215f)
                curveTo(22.136585f,16.260283f,21.921824f,17.00066f,21.4f,17.5f)
                lineTo(17.8f,20.8f)
                curveTo(17.099998f,21.599998f,16.099998f,22.0f,14.999999f,22.0f)
                lineTo(10.999999f,22.0f)
                curveTo(9.899999f,22.0f,8.9f,21.6f,8.199999f,20.8f)
                lineTo(6.897999f,19.335999f)
                curveTo(6.708392f,19.122482f,6.4365516f,19.00021f,6.151f,19.0f)
                lineTo(5.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(14.0f,14.0f)
                curveTo(15.101078f,14.004924f,15.9910755f,14.8989105f,15.9910755f,16.0f)
                curveTo(15.9910755f,17.10109f,15.101078f,17.995075f,14.0f,18.0f)
                lineTo(12.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                lineTo(20.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                curveTo(5.017235f,6.1462264f,8.146188f,3.031235f,12.0f,3.031235f)
                curveTo(15.853812f,3.031235f,18.982765f,6.1462264f,19.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,14.0f)
                lineTo(5.0f,20.0f)
                curveTo(5.0f,20.552284f,4.5522847f,21.0f,4.0f,21.0f)
                lineTo(2.0f,21.0f)
            }
}

public val LucideIcons.All.HandPlatterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandPlatter: ImageVector
    @Composable get() = HandPlatterDefinition.asImageVector()

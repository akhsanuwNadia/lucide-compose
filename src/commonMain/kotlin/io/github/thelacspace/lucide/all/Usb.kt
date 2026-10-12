package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Usb") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,7.0f)
                curveTo(8.998398f,7.3583307f,9.188645f,7.69013f,9.498705f,7.86976f)
                curveTo(9.8087635f,8.04939f,10.1912365f,8.04939f,10.501295f,7.86976f)
                curveTo(10.811355f,7.69013f,11.001602f,7.3583307f,11.0f,7.0f)
                curveTo(11.001602f,6.6416693f,10.811355f,6.30987f,10.501295f,6.13024f)
                curveTo(10.1912365f,5.9506106f,9.8087635f,5.9506106f,9.498705f,6.13024f)
                curveTo(9.188645f,6.30987f,8.998398f,6.6416693f,9.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                curveTo(2.9983976f,20.358332f,3.1886451f,20.69013f,3.4987047f,20.86976f)
                curveTo(3.808764f,21.049389f,4.191236f,21.049389f,4.5012956f,20.86976f)
                curveTo(4.8113546f,20.69013f,5.0016026f,20.358332f,5.0f,20.0f)
                curveTo(5.0016026f,19.641668f,4.8113546f,19.30987f,4.5012956f,19.13024f)
                curveTo(4.191236f,18.950611f,3.808764f,18.950611f,3.4987047f,19.13024f)
                curveTo(3.1886451f,19.30987f,2.9983976f,19.641668f,3.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.7f,19.3f)
                lineTo(19.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(18.0f,4.0f)
                lineTo(20.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.26f,7.68f)
                lineTo(5.0f,12.0f)
                lineTo(7.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,14.0f)
                lineTo(15.0f,16.0f)
                lineTo(18.5f,12.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(19.0f,11.0f)
                lineTo(20.0f,12.0f)
                lineTo(19.0f,13.0f)
                close()
            }
}

public val LucideIcons.All.UsbDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Usb: ImageVector
    @Composable get() = UsbDefinition.asImageVector()

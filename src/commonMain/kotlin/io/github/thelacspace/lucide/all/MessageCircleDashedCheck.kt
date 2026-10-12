package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleDashedCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.1f,2.182f)
                curveTo(11.355024f,1.9391211f,12.644977f,1.9391211f,13.900001f,2.182f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.9f,21.818f)
                curveTo(12.644976f,22.060879f,11.355023f,22.060879f,10.099999f,21.818f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.609f,3.72f)
                curveTo(18.67047f,4.4392233f,19.58372f,5.355869f,20.299f,6.42f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.182f,13.9f)
                curveTo(1.9391211f,12.644976f,1.9391211f,11.355023f,2.182f,10.099999f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.28f,17.61f)
                curveTo(19.560778f,18.67147f,18.64413f,19.58472f,17.58f,20.300001f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.818f,10.1f)
                curveTo(22.060879f,11.355024f,22.060879f,12.644977f,21.818f,13.900001f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.721f,6.391f)
                curveTo(4.440223f,5.32953f,5.3568687f,4.4162793f,6.421f,3.7009997f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.163f,21.117f)
                lineTo(3.2570002f,21.967001f)
                curveTo(2.9220543f,22.055971f,2.5649228f,21.965176f,2.3131382f,21.72704f)
                curveTo(2.0613534f,21.488903f,1.9508166f,21.13738f,2.0210004f,20.798f)
                lineTo(2.9860003f,17.818f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,9.0f)
                lineTo(10.5f,14.5f)
                lineTo(8.0f,12.0f)
            }
}

public val LucideIcons.All.MessageCircleDashedCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleDashedCheck: ImageVector
    @Composable get() = MessageCircleDashedCheckDefinition.asImageVector()

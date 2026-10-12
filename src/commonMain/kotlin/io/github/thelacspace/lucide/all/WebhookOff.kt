package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WebhookOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,17.0f)
                lineTo(12.0f,17.0f)
                curveTo(10.91f,16.98f,10.059999f,17.92f,9.5f,18.9f)
                curveTo(8.8068075f,20.144741f,7.500591f,20.923443f,6.0759573f,20.941244f)
                curveTo(4.6513233f,20.959045f,3.3260577f,20.213224f,2.6019795f,18.986193f)
                curveTo(1.8779017f,17.75916f,1.8657019f,16.238491f,2.57f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,3.4f)
                curveTo(9.852409f,2.411739f,11.133337f,1.9014658f,12.431792f,2.0329044f)
                curveTo(13.730247f,2.164343f,14.882932f,2.9209635f,15.52f,4.06f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,17.0f)
                lineTo(9.1f,11.2f)
                curveTo(9.411299f,10.556263f,9.432047f,9.8100395f,9.157001f,9.15f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.3f,20.3f)
                curveTo(19.623253f,20.763662f,18.820309f,21.008038f,18.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.6f,13.0f)
                curveTo(20.35174f,13.268675f,21.717854f,14.657986f,21.957f,16.414f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.6f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.WebhookOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WebhookOff: ImageVector
    @Composable get() = WebhookOffDefinition.asImageVector()

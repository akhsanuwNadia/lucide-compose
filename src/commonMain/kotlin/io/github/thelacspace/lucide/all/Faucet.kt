package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Faucet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.083f,5.428f)
                lineTo(5.57f,4.083f)
                curveTo(4.751227f,3.8397f,3.868307f,4.143232f,3.3722165f,4.838558f)
                curveTo(2.8761258f,5.533884f,2.8763692f,6.4675217f,3.3728225f,7.162589f)
                curveTo(3.8692758f,7.8576565f,4.7523537f,8.1607275f,5.571f,7.9170003f)
                lineTo(10.083f,6.5720005f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.917f,5.428f)
                lineTo(18.428f,4.083f)
                curveTo(19.24671f,3.8394864f,20.129707f,4.142788f,20.62598f,4.8379846f)
                curveTo(21.122252f,5.5331817f,21.122252f,6.466819f,20.62598f,7.162016f)
                curveTo(20.129707f,7.8572125f,19.24671f,8.160514f,18.428f,7.9170003f)
                lineTo(13.917999f,6.5720005f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,17.0f)
                lineTo(18.0f,12.9939995f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,11.0f)
                lineTo(22.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(19.0f,12.0f)
                curveTo(18.45005f,11.99999f,18.0033f,12.44406f,18.0f,12.994f)
                lineTo(15.461f,12.994f)
                curveTo(14.746903f,11.761574f,13.431313f,11.001857f,12.006951f,10.999386f)
                curveTo(10.58259f,10.996914f,9.264371f,11.752059f,8.5460005f,12.982f)
                lineTo(7.0f,13.0f)
                curveTo(4.2385764f,13.0f,2.0f,15.238576f,2.0f,18.0f)
                lineTo(2.0f,19.0f)
                curveTo(2.0f,19.552284f,2.4477153f,20.0f,3.0f,20.0f)
                lineTo(5.0f,20.0f)
                curveTo(5.5522847f,20.0f,6.0f,19.552284f,6.0f,19.0f)
                lineTo(6.0f,18.0f)
                curveTo(5.9999933f,17.449661f,6.444669f,17.002752f,6.995f,17.0f)
                lineTo(8.547f,17.018f)
                curveTo(9.264248f,18.245308f,10.578976f,18.999748f,12.0005f,18.999748f)
                curveTo(13.422025f,18.999748f,14.7367525f,18.245308f,15.454f,17.018f)
                lineTo(18.0f,17.0f)
                curveTo(18.0f,17.552284f,18.447716f,18.0f,19.0f,18.0f)
                lineTo(22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,6.0f)
                curveTo(9.996795f,6.716662f,10.377291f,7.3802605f,10.997409f,7.7395196f)
                curveTo(11.617528f,8.098779f,12.382472f,8.098779f,13.002591f,7.7395196f)
                curveTo(13.622709f,7.3802605f,14.003205f,6.716662f,14.0f,6.0f)
                curveTo(14.003205f,5.283338f,13.622709f,4.6197395f,13.002591f,4.2604804f)
                curveTo(12.382472f,3.9012208f,11.617528f,3.9012208f,10.997409f,4.2604804f)
                curveTo(10.377291f,4.6197395f,9.996795f,5.283338f,10.0f,6.0f)
            }
}

public val LucideIcons.All.FaucetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Faucet: ImageVector
    @Composable get() = FaucetDefinition.asImageVector()

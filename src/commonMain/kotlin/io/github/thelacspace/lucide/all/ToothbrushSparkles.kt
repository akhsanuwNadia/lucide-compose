package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToothbrushSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(8.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.586000442504883,11.413999557495117)
                lineTo(22.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,11.0)
                curveTo(14.861937522888184,11.138532638549805,14.718841552734375,11.271955490112305,14.571000099182129,11.399999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,22.0)
                lineTo(9.0,15.0)
                curveTo(10.857000350952148,13.142999649047852,12.71399974822998,13.010000228881836,14.571000099182129,11.399999618530273)
                lineTo(12.586000442504883,9.413999557495117)
                curveTo(12.014184951782227,8.842011451721191,11.843156814575195,7.981926441192627,12.152645111083984,7.234691143035889)
                curveTo(12.462132453918457,6.487455368041992,13.191208839416504,6.000173091888428,14.0,6.0)
                curveTo(14.0,4.895430564880371,14.895430564880371,4.0,16.0,4.0)
                curveTo(15.999832153320312,3.2281854152679443,16.443782806396484,2.525153875350952,17.140735626220703,2.1935572624206543)
                curveTo(17.83768653869629,1.8619604110717773,18.663240432739258,1.960984468460083,19.262001037597656,2.447999954223633)
                lineTo(21.41400146484375,4.585999965667725)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,15.0)
                lineTo(20.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(18.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,5.0)
                lineTo(4.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,7.0)
                lineTo(2.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(9.0,4.0)
            }
}

public val LucideIcons.All.ToothbrushSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToothbrushSparkles: ImageVector
    @Composable get() = ToothbrushSparklesDefinition.asImageVector()

package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spade") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.49899959564209)
                curveTo(2.0004560947418213,16.776870727539062,3.4050071239471436,18.81874656677246,5.53207540512085,19.633779525756836)
                curveTo(7.659143447875977,20.44881248474121,10.068511009216309,19.868322372436523,11.590999603271484,18.173999786376953)
                curveTo(11.821676254272461,17.959611892700195,12.178847312927246,17.96004867553711,12.4089994430542,18.174999237060547)
                curveTo(13.931487083435059,19.869321823120117,16.34085464477539,20.449811935424805,18.467924118041992,19.634780883789062)
                curveTo(20.59499168395996,18.819747924804688,21.999544143676758,16.77787208557129,22.0,14.5)
                curveTo(22.0,12.210000038146973,20.5,10.5,19.0,9.0)
                lineTo(13.507999420166016,3.688000202178955)
                curveTo(13.131211280822754,3.2549550533294678,12.586519241333008,3.0046799182891846,12.012514114379883,3.0008530616760254)
                curveTo(11.438508033752441,2.9970264434814453,10.890527725219727,3.2400171756744385,10.507999420166016,3.6680002212524414)
                lineTo(5.0,8.99899959564209)
                curveTo(3.5,10.49899959564209,2.0,12.198999404907227,2.0,14.49899959564209)
            }
}

public val LucideIcons.All.SpadeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spade: ImageVector
    @Composable get() = SpadeDefinition.asImageVector()
